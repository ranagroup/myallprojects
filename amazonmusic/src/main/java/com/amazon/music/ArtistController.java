package com.amazon.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.music.dtos.ArtistDto;
import com.amazon.music.services.ArtistService;

@RestController
@RequestMapping("/artist")
public class ArtistController {
	
	@Autowired
	private ArtistService artistService;
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public void createArtist(@RequestBody ArtistDto artistDto) {
		System.out.println(artistDto.toString());
	}
	@RequestMapping(value="", method = RequestMethod.GET)
	public ArtistDto getArtistDtoID(@RequestParam(value = "name", required = true)Long artistId,
			@RequestParam(value = "name", required = false) String name) {
		System.out.println("id :"+artistId+", name :"+name);
		return artistService.getArtistById(artistId);
	}
	
	@RequestMapping(value ="/{id}/detail", method = RequestMethod.GET)
	public ArtistDto getArtistFromId(@PathVariable(value="id") Long artistId,
			@RequestHeader(value="auth-token") String authToken) {
		System.out.println("auth-token : " + authToken);
		return artistService.getArtistById(artistId);
	}

}
