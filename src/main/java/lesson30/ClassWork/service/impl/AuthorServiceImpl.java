package lesson30.ClassWork.service.impl;

import lesson30.ClassWork.model.Author;
import lesson30.ClassWork.model.repository.AuthorRepository;
import lesson30.ClassWork.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public void save(Author author) {
        authorRepository.save(author);
    }
}
