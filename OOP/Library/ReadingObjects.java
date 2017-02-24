package Library;

import Library.Library.Types;

public abstract class ReadingObjects {
	private Library.Types type;

	public ReadingObjects(Types type) {
		this.type = type;
	}

	public Library.Types getType() {
		return type;
	}
}
