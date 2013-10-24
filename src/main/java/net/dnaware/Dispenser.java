package net.dnaware;

import java.util.Map;

public interface Dispenser {

	public boolean addCoin(int coinFaceValue);

	public Map<Integer, Integer> availableCoins();

	public boolean dispenseCoin(int coinFaceValue);

}
