package chess.search.search34;


public interface Hash {
	public void put(final long zkey, final TTEntry t);
	public TTEntry get(final long zkey);
	public void clear();
}
