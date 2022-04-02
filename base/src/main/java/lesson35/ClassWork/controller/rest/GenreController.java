package lesson35.ClassWork.controller.rest;

import lesson35.ClassWork.dto.ResultDto;
import lesson35.ClassWork.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GenreController {

    private final GenreService genreService;

    @DeleteMapping("/genres/{code}")
    public ResponseEntity<?> delete(@PathVariable("code") String genreCode) {
        genreService.deleteByCode(genreCode);
        return ResponseEntity.ok(new ResultDto());
    }
}

