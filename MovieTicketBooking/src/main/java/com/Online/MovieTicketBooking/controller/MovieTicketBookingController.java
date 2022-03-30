package com.Online.MovieTicketBooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.Online.MovieTicketBooking.jwt.JwtUtil;
import com.Online.MovieTicketBooking.model.JwtToken;
import com.Online.MovieTicketBooking.model.User;
import com.Online.MovieTicketBooking.repository.UserRepository;
import com.Online.MovieTicketBooking.services.MyUserDetailsService;

//import com.Online.MovieTicketBooking.services.UserService;
@RestController
public class MovieTicketBookingController {
	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtUtil jwtTokenUtil;

	@Autowired
	private MyUserDetailsService userDetailsService;

	@RequestMapping("/hello")
	public String firstPage() {
		return "Hello World";
	}
	@RequestMapping("/")
	public String header() {
		return "header";
//		return "redirect:/http://localhost:8080/hello,[{\"key\":\"Authorization\",\"value\":\"Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMjIwMDQwMDhAc2FzdHJhLmFjLmluIiwiZXhwIjoxNjQ4NjkzMTA1LCJpYXQiOjE2NDg2NTcxMDV9.QM5vp7iP8hdIkan6tpodTOo88DoFG8-WNnav3aVj22w\",\"description\":\"\",\"type\":\"text\",\"enabled\":true}]";
	}
	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("login.jsp");
		mav.addObject("userlogin", new User());
		

		return mav;
	}

	@PostMapping("/authenticate")
	public ResponseEntity<?> createAuthenticationToken(@RequestParam String email,@RequestParam String password) throws Exception{
		try {
			authenticationManager
					.authenticate(new UsernamePasswordAuthenticationToken(email, password));
		} catch (BadCredentialsException e) {
			throw new Exception("Incorrect username or password", e);
		}

		final UserDetails userDetails = userDetailsService.loadUserByUsername(email);

		final String jwt = jwtTokenUtil.generateToken(userDetails);

		return ResponseEntity.ok(new JwtToken(jwt));
	}
	}
	
//	@GetMapping("/authenticate")
//	@RequestMapping(value = "/aut", method = RequestMethod.POST)
//	public ResponseEntity<?> createAuthenticationToken(@RequestBody User user) throws Exception {
//
//		try {
//			authenticationManager
//					.authenticate(new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword()));
//		} catch (BadCredentialsException e) {
//			throw new Exception("Incorrect username or password", e);
//		}
//
//		final UserDetails userDetails = userDetailsService.loadUserByUsername(user.getEmail());
//
//		final String jwt = jwtTokenUtil.generateToken(userDetails);
//
//		return ResponseEntity.ok(new JwtToken(jwt));
//	}
//
//}

//@Controller
//public class MovieTicketBookingController {
//	@Autowired
//	private UserRepository repo;
//
//	@RequestMapping("/")
////	@ResponseBody
//	public String viewHomepage() {
//		return "home.jsp";
//	}
//
//	@RequestMapping("/register")
//	public String showSignUpForm() {
//		return "signup.jsp";
//	}
//
//	@RequestMapping("/welcome")
//	public String showWelcomeExistingUser() {
//		return "outlogin.jsp";
//	}
//
//	@RequestMapping("/adduser")
//	public ModelAndView addUser(User user) {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("obj", user);
//		mv.setViewName("out.jsp");
//		repo.save(user);
//		return mv;
//	}
//
//	@GetMapping("/login")
//	public ModelAndView login() {
//		ModelAndView mav = new ModelAndView("login.jsp");
//		mav.addObject("userlogin", new User());
//		
//
//		return mav;
//	}
//
//	@PostMapping("/authenticate")
//	public String addAuthenticate(String email, String password) {
//		User user = repo.findByEmail(email);
//		if (user != null) {
//			if (user.getPassword().equals(password)) {
//				return "redirect:/welcome";
//			}
//			return "redirect:/login";
//		}
//		return "redirect:/login";
//	}
//}
