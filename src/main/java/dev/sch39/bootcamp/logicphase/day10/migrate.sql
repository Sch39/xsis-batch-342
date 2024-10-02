-- create table
-- lecturer
CREATE TABLE lecturer_types(
  id SERIAL PRIMARY KEY,
  code VARCHAR(10) NOT NULL UNIQUE,
  description VARCHAR(20) NOT NULL
);
CREATE TABLE departments(
  id SERIAL PRIMARY KEY,
  code VARCHAR(10) NOT NULL UNIQUE,
  name VARCHAR(50) NOT NULL,
  is_active BOOLEAN NOT NULL DEFAULT FALSE
);
CREATE TABLE lecturers(
  id SERIAL PRIMARY KEY,
  code VARCHAR(10) NOT NULL UNIQUE,
  name VARCHAR(50) NOT NULL,
  department_code VARCHAR(10) NOT NULL,
  lecturer_type_code VARCHAR(10) NOT NULL
);
ALTER TABLE lecturers
ADD CONSTRAINT fk_lectures__departments FOREIGN KEY(department_code) REFERENCES departments(code) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE lecturers
ADD CONSTRAINT fk_lectures__lecturer_types FOREIGN KEY(lecturer_type_code) REFERENCES lecturer_types(code) ON DELETE CASCADE ON UPDATE CASCADE;
-- students
CREATE TABLE religions(
  id SERIAL PRIMARY KEY,
  code VARCHAR(10) NOT NULL UNIQUE,
  description VARCHAR(20)
);
CREATE TABLE students(
  id SERIAL PRIMARY KEY,
  code VARCHAR(10) NOT NULL UNIQUE,
  name VARCHAR(50),
  address VARCHAR(100) NOT NULL,
  religion_code VARCHAR(10) NOT NULL,
  department_code VARCHAR(10) NOT NULL
);
ALTER TABLE students
ADD CONSTRAINT fk_students__religions FOREIGN KEY(religion_code) REFERENCES religions(code) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE students
ADD CONSTRAINT fk_students__departments FOREIGN KEY(department_code) REFERENCES departments(code) ON DELETE CASCADE ON UPDATE CASCADE;
CREATE TABLE exams(
  id SERIAL PRIMARY KEY,
  code VARCHAR(10) NOT NULL UNIQUE,
  name VARCHAR(50) NOT NULL,
  is_active BOOLEAN NOT NULL DEFAULT FALSE
);
CREATE TABLE scores(
  id SERIAL PRIMARY KEY,
  student_code VARCHAR(10) NOT NULL,
  exam_code VARCHAR(10) NOT NULL,
  score INTEGER NOT NULL
);
ALTER TABLE scores
ADD CONSTRAINT fk_scores__exams FOREIGN KEY(exam_code) REFERENCES exams(code) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE scores
ADD CONSTRAINT fk_scores__students FOREIGN KEY(student_code) REFERENCES students(code) ON DELETE CASCADE ON UPDATE CASCADE;