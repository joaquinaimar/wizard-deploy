package com.wizard.servlet.example.infrastructure.staticserver.domain.config;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StaticServerIpVo {

	private String ipAddress = null;

	private String subnetMask = null;

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		if (isIP(ipAddress))
			this.ipAddress = ipAddress;
	}

	public String getSubnetMask() {
		return subnetMask;
	}

	public void setSubnetMask(String subnetMask) {
		if (isIP(subnetMask))
			this.subnetMask = subnetMask;
	}

	private boolean isIP(String str) {
		if (null == str || "".equals(str))
			return false;
		String num = "(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)";
		String regex = "^" + num + "\\." + num + "\\." + num + "\\." + num + "$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}

	public static long ipToLong(String strIP) {
		long[] ip = new long[4];
		int position1 = strIP.indexOf(".");
		int position2 = strIP.indexOf(".", position1 + 1);
		int position3 = strIP.indexOf(".", position2 + 1);
		ip[0] = Long.parseLong(strIP.substring(0, position1));
		ip[1] = Long.parseLong(strIP.substring(position1 + 1, position2));
		ip[2] = Long.parseLong(strIP.substring(position2 + 1, position3));
		ip[3] = Long.parseLong(strIP.substring(position3 + 1));
		return (ip[0] << 24) + (ip[1] << 16) + (ip[2] << 8) + ip[3];
	}

	public boolean ifInNetwork(String str) {
		if (!isIP(this.ipAddress) || !isIP(str))
			return false;

		if (!isIP(this.subnetMask)) {
			if (str.equals(this.ipAddress)) {
				return true;
			}
		} else {
			long ipAddress = Long.valueOf(String.valueOf(ipToLong(this.ipAddress)));
			long subnetMask = Long.valueOf(String.valueOf(ipToLong(this.subnetMask)));
			long targetIpAddress = Long.valueOf(String.valueOf(ipToLong(str)));

			if ((ipAddress & subnetMask) == (targetIpAddress & subnetMask)) {
				return true;
			}
		}

		return false;

	}

}
