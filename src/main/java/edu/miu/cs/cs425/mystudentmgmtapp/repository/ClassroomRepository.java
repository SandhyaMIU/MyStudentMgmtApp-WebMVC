package edu.miu.cs.cs425.mystudentmgmtapp.repository;

import edu.miu.cs.cs425.mystudentmgmtapp.model.Classroom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomRepository extends CrudRepository<Classroom, Integer> {
}
