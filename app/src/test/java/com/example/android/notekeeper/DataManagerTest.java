package com.example.android.notekeeper;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by IKENNA on 1/13/2019.
 */
public class DataManagerTest {
    @Test
    public void createNewNote() throws Exception {
        final DataManager dm = DataManager.getInstance();
        final CourseInfo course = dm.getCourse("android_async");
        final String noteTitle = "Test note title";
        final String noteText = "This is the body text of my test note";

        int noteIndex = dm.createNewNote();
        NoteInfo newNote = dm.getNotes().get(noteIndex);
        newNote.setCourse(course);
        newNote.setTitle(noteTitle);
        newNote.setText(noteText);

        NoteInfo compareNotes = dm.getNotes().get(noteIndex);
        assertEquals(course, compareNotes.getCourse());
        assertEquals(noteTitle, compareNotes.getTitle());
        assertEquals(noteText, compareNotes.getText());
    }

}