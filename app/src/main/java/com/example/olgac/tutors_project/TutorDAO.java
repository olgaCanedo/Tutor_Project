package com.example.olgac.tutors_project;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.RoomWarnings;
import android.arch.persistence.room.Update;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.IGNORE;
import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

/**
 * Created by olgac on 3/28/2018.
 */
@Dao
public interface TutorDAO {

    @Query("SELECT * FROM Tutor")
    List<Tutor> findAllTutorSync();

    @Query("SELECT * " +
            " FROM Tutor INNER JOIN Campus ON Tutor.campusID = Campus.IDCampus" +
            " INNER JOIN Subjects ON Tutor.subjectID = Subjects.IDSubject")
    List<TutorComplete> findAllTutorCompleteSync();

    /**
     * @param ID
     * @return
     */
    @Query("SELECT * " +
            " FROM Tutor INNER JOIN Campus ON Tutor.campusID = Campus.IDCampus" +
            " INNER JOIN Subjects ON Tutor.subjectID = Subjects.IDSubject" +
            " WHERE Tutor.tutorId = :ID")
    @SuppressWarnings(RoomWarnings.CURSOR_MISMATCH)
    TutorComplete findTutorCampleteByTutorIDSync(int ID);

    @Query("SELECT * FROM Tutor WHERE tutorId = :tutorID")
    Tutor loadTutorBytutorID(int tutorID);

    @Query("SELECT Skills.IDSkill,Skills.nameSkill, Skills.IDSubject  FROM Tutor INNER JOIN tutorsSkill ON Tutor.tutorId = tutorsSkill.IDTutor" +
            " INNER JOIN Skills ON Skills.IDSkill = tutorsSkill.IDSkill" +
            " WHERE Tutor.tutorId =:tutorID")
    List<Skills> getSkillsByTutorID(int tutorID);


    @Query("DELETE FROM Tutor WHERE tutorId = :tutorID")
    void deleteTutor(int tutorID);

    @Query("DELETE FROM Tutor")
    void deleteAll();

    @Insert(onConflict = IGNORE)
    void insertTutor(Tutor tutor);

   /* @Query("INSERT INTO TutorsSkills(IDTutor, IDSkills)" +
            " VALUES (:idTutor, :idSkills)")
    void insertSkillTutor(int idTutor, int idSkills );
    */

    @Update(onConflict = REPLACE)
    void updateTutor(Tutor tutor);

}
