package com.movistar.backendmovistar.error;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
@RequiredArgsConstructor
@Order()
public class GlobalControllerAdvice extends ResponseEntityExceptionHandler {

    private static final Logger adviceLogger = LoggerFactory.getLogger(GlobalControllerAdvice.class);

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleAllExceptions(Exception ex) {
        adviceLogger.error("critical error", ex.fillInStackTrace());
        return buildResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage());
    }

    @Override
    protected ResponseEntity<Object> handleExceptionInternal(@NonNull Exception ex,
                                                             Object body,
                                                             @NonNull HttpHeaders headers,
                                                             @NonNull HttpStatusCode statusCode,
                                                             @NonNull WebRequest request) {
        HttpStatus httpStatus = HttpStatus.valueOf(statusCode.value());
        return buildResponseEntity(httpStatus, ex.getMessage());
    }

    protected <T> ResponseEntity<Object> buildResponseEntity(final HttpStatus status, final String message) {
        var apiError = new ApiError<T>(message);
        return ResponseEntity.status(status).body(apiError);
    }

}
