package jeju.service.face;

import java.util.List;

import jeju.dto.Plan;

public interface PlanService {
	
	/**
	 * 일정 생성
	 * @param inData - 일정 form data
	 * @return DB에 삽입한 일정정보
	 */
	public Plan create(Plan inData);
	/**
	 * 일정 번호로 일정 조회
	 * @param inData - 일정 번호 
	 * @return 일정 번호에 해당하는 일정 정보
	 */
	public Plan getPlan(Plan inData);
	/**
	 * 일정번호에 해당하는 일정을 삭제한다
	 * @param inData - 일정 번호
	 */
	public void remove(Plan inData);
	/**
	 * 로그인한 유저가 작성한 일정을 모두 조회한다.
	 * @param myplan - 유저번호
	 * @return 본인이 작성한 일정 리스트
	 */
	public List<Plan> getList(Plan myplan);

}
