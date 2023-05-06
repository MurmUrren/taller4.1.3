import java.util.Vector;

public class KanbanBoard extends KambanProject {
	private Column _columns;
	private String _nombre;
	public Vector<Members> _unnamed_Members_ = new Vector<Members>();
	public Vector<Milestone> _unnamed_Milestone_ = new Vector<Milestone>();
	public Vector<Column> _unnamed_Column_ = new Vector<Column>();

	public void addColumn() {
		throw new UnsupportedOperationException();
	}
}