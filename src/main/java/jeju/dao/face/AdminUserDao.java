package jeju.dao.face;

import java.util.List;

import jeju.dto.JejuUser;
import jeju.util.Paging;

public interface AdminUserDao {

	/**
	 * 전체 사용자 수 조회
	 * 
	 * @return 총 사용자 수
	 */
	public int selectCountAll();

	/**
	 * 페이징 적용한 사용자 목록 조회
	 * 
	 * @param paging - 페이징 정보 객체
	 * @return 페이징이 적용된 사용자 목록
	 */
	public List<JejuUser> selectPageList(Paging paging);
	
	/**
	 * userNo를 이용한 사용자정보 조회
	 * 
	 * @param user - userNo를 가진 객체
	 * @return 조회된 사용자정보
	 */
	public JejuUser selectInfo(JejuUser userInfo);

	/**
	 * 사용자정보 수정
	 * 
	 * @param user - 수정할 사용자정보
	 */
	public void update(JejuUser user);
	
	/**
	 * 사용자계정 삭제
	 * 
	 * @param user - 삭제할 사용자계정
	 */
	public void delete(JejuUser user);
	
}
