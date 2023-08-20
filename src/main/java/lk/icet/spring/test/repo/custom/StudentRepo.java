package lk.icet.spring.test.repo.custom;

import lk.icet.spring.test.entity.StudentEntity;
import lk.icet.spring.test.repo.SuperRepo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<StudentEntity, Long>{
    Iterable<StudentEntity> findByName(String name);
}
