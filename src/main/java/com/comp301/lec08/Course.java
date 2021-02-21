package com.comp301.lec08;

import java.util.ArrayList;
import java.util.List;

public class Course {
  private final Room room;
  private final Professor professor;
  private final List<Student> roster;
  private final String name;
  private final int credits;

  public Course(Room room, Professor professor, String name, int credits) {
    this.room = room;
    this.professor = professor;
    this.roster = new ArrayList<Student>();
    this.name = name;
    this.credits = credits;
  }

  public void enrollStudent(Student s) {
    if (!roster.contains(s)) {
      roster.add(s);
      s.takeCredits(credits);
    }
  }

  public void dropStudent(Student s) {
    if (roster.contains(s)) {
      roster.remove(s);
      s.takeCredits(-credits);
    }
  }

  @Override
  public String toString() {
    String str = name;
    str += "Taught by " + professor.getName() + "\n";
    str += "Location: " + room + "\n";
    str += "----------------------" + "\n";
    for (int i = 0; i < roster.size(); i++) {
      str += roster.get(i).getName() + "\n";
    }
    return str;
  }
}
