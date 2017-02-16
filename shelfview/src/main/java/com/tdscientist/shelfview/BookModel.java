package com.tdscientist.shelfview;


/**
 * Copyright (c) 2017 Adediji Adeyinka(tdscientist)
 * All rights reserved
 * Created on 11-Feb-2017
 */

public class BookModel {

    private String bookCoverSource;
    private String bookId;
    private String bookTitle;

    public BookModel(String bookCoverSource, String bookId, String bookTitle) {
        this.bookCoverSource = bookCoverSource;
        this.bookId = bookId;
        this.bookTitle = bookTitle;
    }

    public String getBookCoverSource() {
        return bookCoverSource;
    }

    public void setBookCoverSource(String bookCoverSource) {
        this.bookCoverSource = bookCoverSource;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
}

