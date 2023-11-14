package com.davor.msscbrewery.web.mappers;

import com.davor.msscbrewery.domain.Beer;
import com.davor.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

	BeerDto beerToBeerDto(Beer beer);

	Beer beerDtoToBeer(BeerDto beerDto);
}
