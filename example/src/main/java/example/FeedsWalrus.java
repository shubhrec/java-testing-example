package example;

import example.values.CannedWalrusFood;
import example.values.Walrus;

public class FeedsWalrus {

	OpensCan opensCan = new OpensCan();

	/****
	 * Feeds a walrus by opening canned food and adding it to the walrus's stomach along with the original can.
	 *
	 * @param gary the walrus to be fed
	 * @param can the canned walrus food to be opened and fed
	 */
	public void feed(Walrus gary, CannedWalrusFood can) {
		gary.addToStomach(opensCan.open(can),can);
	}

}
