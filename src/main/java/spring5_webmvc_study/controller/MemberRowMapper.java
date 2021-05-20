package spring5_webmvc_study.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MemberRowMapper implements RowMapper<Member> {

	@Override
	public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
		Member member = new Member(rs.getString("email"), rs.getString("password"), rs.getString("name"), rs.getTimestamp("regdate").toLocalDateTime());
		
		member.setId(rs.getLong("id"));
		return member;
	}

}
