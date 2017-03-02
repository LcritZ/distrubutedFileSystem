package com.yu.db.model;

public class StorageServer {

	private boolean isAlive;

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	private String ipAddress;

	public String getIpAddres() {
		return ipAddress;
	}

	public void setIpAddres(String ipAddres) {
		this.ipAddress = ipAddres;
	}

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column storage_server.id
	 *
	 * @mbggenerated
	 */
	private Integer id;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column storage_server.name
	 *
	 * @mbggenerated
	 */
	private String name;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column storage_server.port
	 *
	 * @mbggenerated
	 */
	private Integer port;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column storage_server.max_volume
	 *
	 * @mbggenerated
	 */
	private Integer maxVolume;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column storage_server.left_vlolume
	 *
	 * @mbggenerated
	 */
	private Integer leftVolume;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column storage_server.storage_dir
	 *
	 * @mbggenerated
	 */
	private String storageDir;

	public StorageServer() {
	}

	public StorageServer(Boolean isAlive, String ipAddress, Integer id,
			String name, Integer port, Integer maxVolume, Integer leftVolume,
			String storageDir) {
		super();
		this.isAlive = isAlive;
		this.ipAddress = ipAddress;
		this.id = id;
		this.name = name;
		this.port = port;
		this.maxVolume = maxVolume;
		this.leftVolume = leftVolume;
		this.storageDir = storageDir;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column storage_server.id
	 *
	 * @return the value of storage_server.id
	 *
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column storage_server.id
	 *
	 * @param id
	 *            the value for storage_server.id
	 *
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column storage_server.name
	 *
	 * @return the value of storage_server.name
	 *
	 * @mbggenerated
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column storage_server.name
	 *
	 * @param name
	 *            the value for storage_server.name
	 *
	 * @mbggenerated
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column storage_server.port
	 *
	 * @return the value of storage_server.port
	 *
	 * @mbggenerated
	 */
	public Integer getPort() {
		return port;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column storage_server.port
	 *
	 * @param port
	 *            the value for storage_server.port
	 *
	 * @mbggenerated
	 */
	public void setPort(Integer port) {
		this.port = port;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column storage_server.max_volume
	 *
	 * @return the value of storage_server.max_volume
	 *
	 * @mbggenerated
	 */
	public Integer getMaxVolume() {
		return maxVolume;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column storage_server.max_volume
	 *
	 * @param maxVolume
	 *            the value for storage_server.max_volume
	 *
	 * @mbggenerated
	 */
	public void setMaxVolume(Integer maxVolume) {
		this.maxVolume = maxVolume;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column storage_server.left_vlolume
	 *
	 * @return the value of storage_server.left_vlolume
	 *
	 * @mbggenerated
	 */
	public Integer getLeftVolume() {
		return leftVolume;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column storage_server.left_vlolume
	 *
	 * @param leftVolume
	 *            the value for storage_server.left_vlolume
	 *
	 * @mbggenerated
	 */
	public void setLeftVolume(Integer leftVolume) {
		this.leftVolume = leftVolume;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column storage_server.storage_dir
	 *
	 * @return the value of storage_server.storage_dir
	 *
	 * @mbggenerated
	 */
	public String getStorageDir() {
		return storageDir;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column storage_server.storage_dir
	 *
	 * @param storageDir
	 *            the value for storage_server.storage_dir
	 *
	 * @mbggenerated
	 */
	public void setStorageDir(String storageDir) {
		this.storageDir = storageDir == null ? null : storageDir.trim();
	}

	@Override
	public String toString() {
		return "StorageServer [isAlive=" + isAlive + ", ipAddress=" + ipAddress
				+ ", id=" + id + ", name=" + name + ", port=" + port
				+ ", maxVolume=" + maxVolume + ", leftVolume=" + leftVolume
				+ ", storageDir=" + storageDir + "]";
	}

	

}