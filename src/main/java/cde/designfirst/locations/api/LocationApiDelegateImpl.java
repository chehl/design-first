package cde.designfirst.locations.api;

import cde.designfirst.locations.api.dto.LocationDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class LocationApiDelegateImpl implements LocationApiDelegate {

    Logger logger = LoggerFactory.getLogger(LocationApiDelegateImpl.class);

    @Override
    public ResponseEntity<LocationDto> getLocationById(String id, String ifNoneMatch) {
        logger.info("Get location by id: {}", id);

        LocationDto locationDto = new LocationDto();
        locationDto.setId(id);
        locationDto.setName("Christoph");
        locationDto.setAddress(ifNoneMatch);
        locationDto.setLatitude(BigDecimal.valueOf(53.55)); // Hamburg
        locationDto.setLongitude(BigDecimal.valueOf(9.99));

        return new ResponseEntity<>(locationDto, HttpStatus.OK);
    }
}
