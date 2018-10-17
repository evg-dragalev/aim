INSERT INTO Timetable (id, description, timetableName) VALUES (1, 'My first timetable', 'My Timetable');

-- Activities
INSERT INTO Activity (id, description, activityName, timetableId) VALUES (1, 'Completing sql exercises at sql-ex.ru', 'Sql', 1 );
INSERT INTO Activity (id, description, activityName, timetableId) VALUES (2, 'Reading hiibernate spec', 'Hibernate', 1 );
INSERT INTO Activity (id, description, activityName, timetableId) VALUES (3, 'Pay for the internet', 'Bills', 1 )''
INSERT INTO Activity (id, description, activityName, timetableId) VALUES (4, 'English upper intermediate level exercises', 'English', 1 );

-- Artifacts
INSERT INTO Artifact (id, artifactType, artifactName, description) VALUES (1, 'LINK', 'sql-ex.ru', 'sql-ex.ru');
INSERT INTO Artifact (id, artifactType, artifactName, description) VALUES (2, 'NOTE', 'SQL BOOK', '<Some book name>');
INSERT INTO Artifact (id, artifactType, artifactName, description) VALUES (3, 'LINK', 'Hibernate spec url', 'http://docs.jboss.org/hibernate/orm/current/userguide/html_single/Hibernate_User_Guide');
INSERT INTO Artifact (id, artifactType, artifactName, description) VALUES (4, 'NOTE', 'Bill number', 'Bill number: 123456789abcd');

INSERT INTO Activity2Artifact (activityId, artifactId) VALUES (1, 1);
INSERT INTO Activity2Artifact (activityId, artifactId) VALUES (1, 2);
INSERT INTO Activity2Artifact (activityId, artifactId) VALUES (2, 3);
INSERT INTO Activity2Artifact (activityId, artifactId) VALUES (3, 4);


-- Time details without restrictions
INSERT INTO TimeDetails (id, detailsType, activityId) VALUES (1, 'FUZZY', 3 );

-- Daily
INSERT INTO TimeDetails (id, detailsType, activityId, startTime) VALUES (2, 'DAYLY', 1, '00:00:00');

-- Deadline
INSERT INTO TimeDetails (id, detailsType, activityId, endDayOfWeek) VALUES (3, 'DEADLINE', 3, 'FRI');

-- PLANNED
INSERT INTO TimeDetails (id, detailsType, activityId, startDayOfWeek, startTime) VALUES (3, 'PLANNED', 3, 'SAT', '19:00:00');

