package net.sourceforge.argparse4j.internal;


public interface ArgumentStore {
    void addArgument(ArgumentImpl arg);
	void addFlags(ArgumentImpl arg, String... flags);
}
