package edu.miu.cs.cs425.mystudentmgmtapp.service;

import edu.miu.cs.cs425.mystudentmgmtapp.model.Classroom;

public interface ClassroomService {

    public Classroom addNewClassroom(Classroom newClassroom);

    Classroom saveClassroom(Classroom newClassroom);


}
