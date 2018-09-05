/* Licensed Materials - 
 Property of IBM 6949 - 67L 
 Copyright IBM Corp. 2017, 2018 All Rights Reserved */
package  com.ibm.gbs.consentmgmt.dto;
// Generated Sep 21, 2017 1:52:20 PM by Hibernate Tools 5.1.0.Beta1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PgStatStatementsId generated by hbm2java
 */
@Embeddable
public class PgStatStatementsId implements java.io.Serializable {

	private Long userid;
	private Long dbid;
	private Long queryid;
	private String query;
	private Long calls;
	private Double totalTime;
	private Double minTime;
	private Double maxTime;
	private Double meanTime;
	private Double stddevTime;
	private Long rows;
	private Long sharedBlksHit;
	private Long sharedBlksRead;
	private Long sharedBlksDirtied;
	private Long sharedBlksWritten;
	private Long localBlksHit;
	private Long localBlksRead;
	private Long localBlksDirtied;
	private Long localBlksWritten;
	private Long tempBlksRead;
	private Long tempBlksWritten;
	private Double blkReadTime;
	private Double blkWriteTime;

	public PgStatStatementsId() {
	}

	public PgStatStatementsId(Long userid, Long dbid, Long queryid, String query, Long calls, Double totalTime,
			Double minTime, Double maxTime, Double meanTime, Double stddevTime, Long rows, Long sharedBlksHit,
			Long sharedBlksRead, Long sharedBlksDirtied, Long sharedBlksWritten, Long localBlksHit, Long localBlksRead,
			Long localBlksDirtied, Long localBlksWritten, Long tempBlksRead, Long tempBlksWritten, Double blkReadTime,
			Double blkWriteTime) {
		this.userid = userid;
		this.dbid = dbid;
		this.queryid = queryid;
		this.query = query;
		this.calls = calls;
		this.totalTime = totalTime;
		this.minTime = minTime;
		this.maxTime = maxTime;
		this.meanTime = meanTime;
		this.stddevTime = stddevTime;
		this.rows = rows;
		this.sharedBlksHit = sharedBlksHit;
		this.sharedBlksRead = sharedBlksRead;
		this.sharedBlksDirtied = sharedBlksDirtied;
		this.sharedBlksWritten = sharedBlksWritten;
		this.localBlksHit = localBlksHit;
		this.localBlksRead = localBlksRead;
		this.localBlksDirtied = localBlksDirtied;
		this.localBlksWritten = localBlksWritten;
		this.tempBlksRead = tempBlksRead;
		this.tempBlksWritten = tempBlksWritten;
		this.blkReadTime = blkReadTime;
		this.blkWriteTime = blkWriteTime;
	}

	@Column(name = "userid")
	public Long getUserid() {
		return this.userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	@Column(name = "dbid")
	public Long getDbid() {
		return this.dbid;
	}

	public void setDbid(Long dbid) {
		this.dbid = dbid;
	}

	@Column(name = "queryid")
	public Long getQueryid() {
		return this.queryid;
	}

	public void setQueryid(Long queryid) {
		this.queryid = queryid;
	}

	@Column(name = "query")
	public String getQuery() {
		return this.query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	@Column(name = "calls")
	public Long getCalls() {
		return this.calls;
	}

	public void setCalls(Long calls) {
		this.calls = calls;
	}

	@Column(name = "total_time", precision = 17, scale = 17)
	public Double getTotalTime() {
		return this.totalTime;
	}

	public void setTotalTime(Double totalTime) {
		this.totalTime = totalTime;
	}

	@Column(name = "min_time", precision = 17, scale = 17)
	public Double getMinTime() {
		return this.minTime;
	}

	public void setMinTime(Double minTime) {
		this.minTime = minTime;
	}

	@Column(name = "max_time", precision = 17, scale = 17)
	public Double getMaxTime() {
		return this.maxTime;
	}

	public void setMaxTime(Double maxTime) {
		this.maxTime = maxTime;
	}

	@Column(name = "mean_time", precision = 17, scale = 17)
	public Double getMeanTime() {
		return this.meanTime;
	}

	public void setMeanTime(Double meanTime) {
		this.meanTime = meanTime;
	}

	@Column(name = "stddev_time", precision = 17, scale = 17)
	public Double getStddevTime() {
		return this.stddevTime;
	}

	public void setStddevTime(Double stddevTime) {
		this.stddevTime = stddevTime;
	}

	@Column(name = "rows")
	public Long getRows() {
		return this.rows;
	}

	public void setRows(Long rows) {
		this.rows = rows;
	}

	@Column(name = "shared_blks_hit")
	public Long getSharedBlksHit() {
		return this.sharedBlksHit;
	}

	public void setSharedBlksHit(Long sharedBlksHit) {
		this.sharedBlksHit = sharedBlksHit;
	}

	@Column(name = "shared_blks_read")
	public Long getSharedBlksRead() {
		return this.sharedBlksRead;
	}

	public void setSharedBlksRead(Long sharedBlksRead) {
		this.sharedBlksRead = sharedBlksRead;
	}

	@Column(name = "shared_blks_dirtied")
	public Long getSharedBlksDirtied() {
		return this.sharedBlksDirtied;
	}

	public void setSharedBlksDirtied(Long sharedBlksDirtied) {
		this.sharedBlksDirtied = sharedBlksDirtied;
	}

	@Column(name = "shared_blks_written")
	public Long getSharedBlksWritten() {
		return this.sharedBlksWritten;
	}

	public void setSharedBlksWritten(Long sharedBlksWritten) {
		this.sharedBlksWritten = sharedBlksWritten;
	}

	@Column(name = "local_blks_hit")
	public Long getLocalBlksHit() {
		return this.localBlksHit;
	}

	public void setLocalBlksHit(Long localBlksHit) {
		this.localBlksHit = localBlksHit;
	}

	@Column(name = "local_blks_read")
	public Long getLocalBlksRead() {
		return this.localBlksRead;
	}

	public void setLocalBlksRead(Long localBlksRead) {
		this.localBlksRead = localBlksRead;
	}

	@Column(name = "local_blks_dirtied")
	public Long getLocalBlksDirtied() {
		return this.localBlksDirtied;
	}

	public void setLocalBlksDirtied(Long localBlksDirtied) {
		this.localBlksDirtied = localBlksDirtied;
	}

	@Column(name = "local_blks_written")
	public Long getLocalBlksWritten() {
		return this.localBlksWritten;
	}

	public void setLocalBlksWritten(Long localBlksWritten) {
		this.localBlksWritten = localBlksWritten;
	}

	@Column(name = "temp_blks_read")
	public Long getTempBlksRead() {
		return this.tempBlksRead;
	}

	public void setTempBlksRead(Long tempBlksRead) {
		this.tempBlksRead = tempBlksRead;
	}

	@Column(name = "temp_blks_written")
	public Long getTempBlksWritten() {
		return this.tempBlksWritten;
	}

	public void setTempBlksWritten(Long tempBlksWritten) {
		this.tempBlksWritten = tempBlksWritten;
	}

	@Column(name = "blk_read_time", precision = 17, scale = 17)
	public Double getBlkReadTime() {
		return this.blkReadTime;
	}

	public void setBlkReadTime(Double blkReadTime) {
		this.blkReadTime = blkReadTime;
	}

	@Column(name = "blk_write_time", precision = 17, scale = 17)
	public Double getBlkWriteTime() {
		return this.blkWriteTime;
	}

	public void setBlkWriteTime(Double blkWriteTime) {
		this.blkWriteTime = blkWriteTime;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PgStatStatementsId))
			return false;
		PgStatStatementsId castOther = (PgStatStatementsId) other;

		return ((this.getUserid() == castOther.getUserid()) || (this.getUserid() != null
				&& castOther.getUserid() != null && this.getUserid().equals(castOther.getUserid())))
				&& ((this.getDbid() == castOther.getDbid()) || (this.getDbid() != null && castOther.getDbid() != null
						&& this.getDbid().equals(castOther.getDbid())))
				&& ((this.getQueryid() == castOther.getQueryid()) || (this.getQueryid() != null
						&& castOther.getQueryid() != null && this.getQueryid().equals(castOther.getQueryid())))
				&& ((this.getQuery() == castOther.getQuery()) || (this.getQuery() != null
						&& castOther.getQuery() != null && this.getQuery().equals(castOther.getQuery())))
				&& ((this.getCalls() == castOther.getCalls()) || (this.getCalls() != null
						&& castOther.getCalls() != null && this.getCalls().equals(castOther.getCalls())))
				&& ((this.getTotalTime() == castOther.getTotalTime()) || (this.getTotalTime() != null
						&& castOther.getTotalTime() != null && this.getTotalTime().equals(castOther.getTotalTime())))
				&& ((this.getMinTime() == castOther.getMinTime()) || (this.getMinTime() != null
						&& castOther.getMinTime() != null && this.getMinTime().equals(castOther.getMinTime())))
				&& ((this.getMaxTime() == castOther.getMaxTime()) || (this.getMaxTime() != null
						&& castOther.getMaxTime() != null && this.getMaxTime().equals(castOther.getMaxTime())))
				&& ((this.getMeanTime() == castOther.getMeanTime()) || (this.getMeanTime() != null
						&& castOther.getMeanTime() != null && this.getMeanTime().equals(castOther.getMeanTime())))
				&& ((this.getStddevTime() == castOther.getStddevTime()) || (this.getStddevTime() != null
						&& castOther.getStddevTime() != null && this.getStddevTime().equals(castOther.getStddevTime())))
				&& ((this.getRows() == castOther.getRows()) || (this.getRows() != null && castOther.getRows() != null
						&& this.getRows().equals(castOther.getRows())))
				&& ((this.getSharedBlksHit() == castOther.getSharedBlksHit())
						|| (this.getSharedBlksHit() != null && castOther.getSharedBlksHit() != null
								&& this.getSharedBlksHit().equals(castOther.getSharedBlksHit())))
				&& ((this.getSharedBlksRead() == castOther.getSharedBlksRead())
						|| (this.getSharedBlksRead() != null && castOther.getSharedBlksRead() != null
								&& this.getSharedBlksRead().equals(castOther.getSharedBlksRead())))
				&& ((this.getSharedBlksDirtied() == castOther.getSharedBlksDirtied())
						|| (this.getSharedBlksDirtied() != null && castOther.getSharedBlksDirtied() != null
								&& this.getSharedBlksDirtied().equals(castOther.getSharedBlksDirtied())))
				&& ((this.getSharedBlksWritten() == castOther.getSharedBlksWritten())
						|| (this.getSharedBlksWritten() != null && castOther.getSharedBlksWritten() != null
								&& this.getSharedBlksWritten().equals(castOther.getSharedBlksWritten())))
				&& ((this.getLocalBlksHit() == castOther.getLocalBlksHit())
						|| (this.getLocalBlksHit() != null && castOther.getLocalBlksHit() != null
								&& this.getLocalBlksHit().equals(castOther.getLocalBlksHit())))
				&& ((this.getLocalBlksRead() == castOther.getLocalBlksRead())
						|| (this.getLocalBlksRead() != null && castOther.getLocalBlksRead() != null
								&& this.getLocalBlksRead().equals(castOther.getLocalBlksRead())))
				&& ((this.getLocalBlksDirtied() == castOther.getLocalBlksDirtied())
						|| (this.getLocalBlksDirtied() != null && castOther.getLocalBlksDirtied() != null
								&& this.getLocalBlksDirtied().equals(castOther.getLocalBlksDirtied())))
				&& ((this.getLocalBlksWritten() == castOther.getLocalBlksWritten())
						|| (this.getLocalBlksWritten() != null && castOther.getLocalBlksWritten() != null
								&& this.getLocalBlksWritten().equals(castOther.getLocalBlksWritten())))
				&& ((this.getTempBlksRead() == castOther.getTempBlksRead())
						|| (this.getTempBlksRead() != null && castOther.getTempBlksRead() != null
								&& this.getTempBlksRead().equals(castOther.getTempBlksRead())))
				&& ((this.getTempBlksWritten() == castOther.getTempBlksWritten())
						|| (this.getTempBlksWritten() != null && castOther.getTempBlksWritten() != null
								&& this.getTempBlksWritten().equals(castOther.getTempBlksWritten())))
				&& ((this.getBlkReadTime() == castOther.getBlkReadTime())
						|| (this.getBlkReadTime() != null && castOther.getBlkReadTime() != null
								&& this.getBlkReadTime().equals(castOther.getBlkReadTime())))
				&& ((this.getBlkWriteTime() == castOther.getBlkWriteTime())
						|| (this.getBlkWriteTime() != null && castOther.getBlkWriteTime() != null
								&& this.getBlkWriteTime().equals(castOther.getBlkWriteTime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUserid() == null ? 0 : this.getUserid().hashCode());
		result = 37 * result + (getDbid() == null ? 0 : this.getDbid().hashCode());
		result = 37 * result + (getQueryid() == null ? 0 : this.getQueryid().hashCode());
		result = 37 * result + (getQuery() == null ? 0 : this.getQuery().hashCode());
		result = 37 * result + (getCalls() == null ? 0 : this.getCalls().hashCode());
		result = 37 * result + (getTotalTime() == null ? 0 : this.getTotalTime().hashCode());
		result = 37 * result + (getMinTime() == null ? 0 : this.getMinTime().hashCode());
		result = 37 * result + (getMaxTime() == null ? 0 : this.getMaxTime().hashCode());
		result = 37 * result + (getMeanTime() == null ? 0 : this.getMeanTime().hashCode());
		result = 37 * result + (getStddevTime() == null ? 0 : this.getStddevTime().hashCode());
		result = 37 * result + (getRows() == null ? 0 : this.getRows().hashCode());
		result = 37 * result + (getSharedBlksHit() == null ? 0 : this.getSharedBlksHit().hashCode());
		result = 37 * result + (getSharedBlksRead() == null ? 0 : this.getSharedBlksRead().hashCode());
		result = 37 * result + (getSharedBlksDirtied() == null ? 0 : this.getSharedBlksDirtied().hashCode());
		result = 37 * result + (getSharedBlksWritten() == null ? 0 : this.getSharedBlksWritten().hashCode());
		result = 37 * result + (getLocalBlksHit() == null ? 0 : this.getLocalBlksHit().hashCode());
		result = 37 * result + (getLocalBlksRead() == null ? 0 : this.getLocalBlksRead().hashCode());
		result = 37 * result + (getLocalBlksDirtied() == null ? 0 : this.getLocalBlksDirtied().hashCode());
		result = 37 * result + (getLocalBlksWritten() == null ? 0 : this.getLocalBlksWritten().hashCode());
		result = 37 * result + (getTempBlksRead() == null ? 0 : this.getTempBlksRead().hashCode());
		result = 37 * result + (getTempBlksWritten() == null ? 0 : this.getTempBlksWritten().hashCode());
		result = 37 * result + (getBlkReadTime() == null ? 0 : this.getBlkReadTime().hashCode());
		result = 37 * result + (getBlkWriteTime() == null ? 0 : this.getBlkWriteTime().hashCode());
		return result;
	}

}
