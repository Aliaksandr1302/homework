package com.alex.librarian.tools;

import com.alex.librarian.entity.LibBook;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LibUtil {

    public static Collection<LibBook> getUnmodifiableVersion(Collection<LibBook> books) {
        return Collections.unmodifiableCollection(books);
    }
    public static List<LibBook> getUnmodifiableVersion(List<LibBook> books) {
        return Collections.unmodifiableList(books);
    }
}

