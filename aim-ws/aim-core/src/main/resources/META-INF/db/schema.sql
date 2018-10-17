DROP WHEN EXISTS Timetable;
DROP WHEN EXISTS Activity;
DROP WHEN EXISTS Artifact;
DROP WHEN EXISTS TimeDetails;
DROP WHEN EXISTS Activity2Artifact;

CREATE TABLE Timetable(
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  description VARCHAR(511),
  timetableName VARCHAR(31)
)

CREATE TABLE Activity(
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  description VARCHAR(511),
  activityName VARCHAR(31),
  timetableId BIGINT,
  CONSTRAINT FK_activity_timetableId FOREIGN KEY timetableId REFERENCES Timetable(id) ON DELETE CASCADE ON UPDATE CASCADE
)

CREATE TABLE Artifact(
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  artifactType activityId,
  artifactName VARCHAR(31)
  description VARCHAR(511)
)

CREATE TABLE TimeDetails(
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  startDate DATE,
  endDate DATE,
  startDayOfWeek ENUM('MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT', 'SUN'),
  endDayOfWeek ENUM('MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT', 'SUN'),
  startTime TIME,
  endTime TIME,
  detailsType VARCHAR(10),
  activityId BIGINT,
  CONSTRAINT FK_timeDetails_activityId FOREIGN KEY activityId REFERENCES Activity(id) ON DELETE CASCADE ON UPDATE CASCADE
)

CREATE TABLE Activity2Artifact(
  activityId BIGINT,
  artifactId BIGINT,
  CONSTRAINT FK_activity2artifact_activityId FOREIGN KEY activityId REFERENCES Activity(id) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT FK_activity2artifact_artifactId FOREIGN KEY artifactId REFERENCES Artifact(id) ON DELETE CASCADE ON UPDATE CASCADE
)
