package net.sourceforge.argparse4j.internal;

public interface Function<T, R> {
	R apply(T t);
}
