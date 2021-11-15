package in.microsoft.repo;

import org.springframework.data.repository.CrudRepository;

import in.microsoft.entity.Book;

public interface CrudRepositoryInterface extends CrudRepository<Book, Integer> {

}
