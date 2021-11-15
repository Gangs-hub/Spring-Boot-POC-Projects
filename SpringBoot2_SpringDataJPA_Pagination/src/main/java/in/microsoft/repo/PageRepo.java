package in.microsoft.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import in.microsoft.entity.Projects;

public interface PageRepo extends PagingAndSortingRepository<Projects, Integer>{

}
