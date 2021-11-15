package in.microsoft.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.microsoft.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer>{

}
