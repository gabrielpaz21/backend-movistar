package com.movistar.backendmovistar.error;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import lombok.*;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
public class ApiError<T> {

	@NonNull
	@JsonFormat(shape = Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ssXXX")
	private OffsetDateTime date = OffsetDateTime.now(ZoneOffset.UTC);

	@NonNull
	private String message;

	private T details;

}
