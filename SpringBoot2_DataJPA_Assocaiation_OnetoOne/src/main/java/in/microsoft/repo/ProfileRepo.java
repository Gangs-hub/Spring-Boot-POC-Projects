package in.microsoft.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import in.microsoft.entity.Profile;



public interface ProfileRepo extends JpaRepositoryImplementation<Profile, Integer> {

}
