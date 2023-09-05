package JpaProject.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import JpaProject.Entity.employeeDet;

public interface Employee extends JpaRepository<employeeDet, Long> {
}
