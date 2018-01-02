package textAdventure;
public class GameObject {
		// Member variables
		private int m_totalCapacity;
		private int m_remainingCapacity;
		private Location m_location;
		private String m_description;
		private int m_weight;
		private String[] m_contains;
		
		public int checkCapacity(GameObject input)
		{
			if (input.m_weight > m_remainingCapacity) {
				return 0;
			} else
			{
				return 1;
			}
		}
}
