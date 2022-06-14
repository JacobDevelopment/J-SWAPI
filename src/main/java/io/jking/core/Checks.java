package io.jking.core;

public final class Checks {

    private Checks() throws IllegalAccessException {
        throw new IllegalAccessException("Cannot instantiate private classes.");
    }

    public static void notNull(final Object object, final String name) {
        if (object == null)
            throw new IllegalArgumentException(name + " may not be null!");
    }

    public static void notEmpty(final String string, final String name) {
        notNull(string, name);
        if (string.isEmpty())
            throw new IllegalArgumentException(name + " may not be empty!");
    }

    public static void check(final boolean expression, final String message) {
        if (!expression)
            throw new IllegalArgumentException(message);
    }
}
