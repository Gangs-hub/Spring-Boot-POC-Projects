package in.microsoft.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.microsoft.entity.Project;

public interface ProjectRepo extends JpaRepository<Project, Integer> {

}
