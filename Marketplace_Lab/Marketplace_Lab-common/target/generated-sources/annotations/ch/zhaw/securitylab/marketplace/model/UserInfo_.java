package ch.zhaw.securitylab.marketplace.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-27T16:11:50")
@StaticMetamodel(UserInfo.class)
public class UserInfo_ { 

    public static volatile SingularAttribute<UserInfo, String> passwordSHA256;
    public static volatile SingularAttribute<UserInfo, String> passwordScrypt;
    public static volatile SingularAttribute<UserInfo, String> password;
    public static volatile SingularAttribute<UserInfo, String> saltScrypt;
    public static volatile SingularAttribute<UserInfo, String> authenticationTokenSHA256;
    public static volatile SingularAttribute<UserInfo, String> username;

}