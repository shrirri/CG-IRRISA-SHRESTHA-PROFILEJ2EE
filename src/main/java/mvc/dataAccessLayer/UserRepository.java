package mvc.dataAccessLayer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
 
@Repository
public interface UserRepository extends JpaRepository<UsersEntity, String> {
	//checking uid pwd for login service	
	@Query(value="SELECT count(1) FROM users WHERE userid= ?1 and password=?2",nativeQuery = true)
	public int checkUidPwdInDB(String uid,String pwd);
	
	//checking uid for delete service
	@Query(value="SELECT count(1) FROM users WHERE userid= ?1",nativeQuery = true)
	public int checkUidInDB(String uid);
	
	//SELECT count(1) FROM users WHERE userid= 'akash' or phone=9299190002 or emailid='zita@gmail.com';
	@Query(value="SELECT count(1) FROM users WHERE userid= ?1 or phone= ?2 or emailid= ?3",nativeQuery = true)
	public int checkUidPhoneEmailExistinDB(String uid,String pnum,String email);
	
	//update for reset password service
	@Transactional
	@Modifying
	@Query("UPDATE UsersEntity u SET u.Pwd=?2 WHERE u.Uid= ?1")
	public int updatePwd(String uid,String pwd);
	
	//update for profile update service
	@Transactional
	@Modifying
	@Query("UPDATE UsersEntity u SET u.Email= ?2 , u.Phonenum= ?3 WHERE u.Uid= ?1")
	public int updateProfile(String uid,String email,String pnum);
	
}

