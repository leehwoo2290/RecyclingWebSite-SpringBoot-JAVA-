package org.mbc.czo.function.apiSecurity.jwt.dto.login;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberLoginReq {

    private String mid;

    private String mpassword;
}
