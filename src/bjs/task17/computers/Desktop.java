package bjs.task17.computers;

/**
 * Created by YM on 26.11.2015.
 * Class Computer presents a desktop computer
 */

public class Desktop extends Computer{
	/**Describes motherboard type and model*/
	private String motherboard;
	/**Describes video card*/
	private VideoCard videoCard;
	/**Display description*/
	private String display;
	/**Chassis and power supply*/
	private String chassis;
	/**Price*/
	private double price;

	/**
	 * Presents information about video card
	 */
	protected class VideoCard {
		/**Card type*/
		private String type;
		/**RAM size, Mb*/
		private double ramSize;
		/**RAM type*/
		private String ramType;

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public double getRamSize() {
			return ramSize;
		}

		public void setRamSize(double ramSize) {
			this.ramSize = ramSize;
		}

		public String getRamType() {
			return ramType;
		}

		public void setRamType(String ramType) {
			this.ramType = ramType;
		}

		@Override
		public String toString() {
			String result = getType() + ", ";
			result += getRamSize() + " Gb, ";
			result += getRamType() + "\n";

			return result;
		}
	}

	public Desktop() {
		videoCard = new VideoCard();
	}

    @Override
    public String toString() {
        String result = super.toString();
		result += videoCard.toString();
		result += "Display: " + display + "\n";
		result += "Chassis: " + chassis + "\n";

        return result;
    }

	/**Sets motherboard type*/
	public void setMotherboard(String motherboard) {
		this.motherboard = motherboard;
	}

	/**
	 * Sets video card
	 * @param type Card name
	 * @param ramSize Card RAM size
	 * @param ramType Card RAM type
     */
	public void setVideoCard(String type, double ramSize, String ramType) {
		this.videoCard.setType(type);
		this.videoCard.setRamSize(ramSize);
		this.videoCard.setRamType(ramType);
	}

	/**
	 * Sets display
	 * @param display Display name and type
     */
	public void setDisplay(String display) {
		this.display = display;
	}

	/**
	 * Sets chassis and power supply
	 * @param chassis Chassis and power supply
     */
	public void setChassis(String chassis) {
		this.chassis = chassis;
	}

	/**
	 * Sets price
	 * @param price Price
     */
	public void setPrice(double price) {
		this.price = price;
	}
}
