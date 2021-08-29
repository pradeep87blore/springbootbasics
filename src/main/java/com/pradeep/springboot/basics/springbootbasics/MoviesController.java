package com.pradeep.springboot.basics.springbootbasics;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MoviesController {

		@GetMapping("/Movies")
		public List<MovieInfo> getAllMovies()
		{
			return Arrays.asList(new MovieInfo("Avatar", "2009"),
					new MovieInfo("Avengers", "2012"),
					new MovieInfo("The Shawshank Redemption", "1994"),
					new MovieInfo("Inception", "2010"));
		}
}
