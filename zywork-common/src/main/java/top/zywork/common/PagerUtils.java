package top.zywork.common;

import top.zywork.constant.AppLoadConstants;
import top.zywork.dto.PagerDTO;

/**
 * 获取分页组件PagerDTO的工具类
 * 创建于2017-08-16
 *
 * @author Wang Zhenyu
 * @version 1.0
 */
public class PagerUtils {

    /**
     * 通过pageNo和pageSize参数获取PagerDTO对象，如果pageNo<=0，则pageNo设置为1，
     * 如果pageSize<=0，则pageSize设置为配置文件中配置的默认页大小
     * @param pageNo 页数
     * @param pageSize 每页显示个数
     * @return PagerDTO对象
     */
    public static PagerDTO getPager(int pageNo, int pageSize) {
        if (pageNo <= 0) {
            pageNo = 1;
        }
        if (pageSize <= 0) {
            pageSize = getPageSize();
        }
        return new PagerDTO(pageNo, pageSize);
    }

    /**
     * 通过pageNo参数获取PagerDTO对象，每页显示的个数为配置文件中配置的默认页大小
     * @param pageNo 页数
     * @return PagerDTO对象
     */
    public static PagerDTO getPager(int pageNo) {
        return getPager(pageNo, getPageSize());
    }

    /**
     * 通过字符串类型的pageNO和pageSize参数获取PagerDTO对象
     * @param pageNo 页数
     * @param pageSize 每页显示个数
     * @return PagerDTO对象
     */
    public static PagerDTO getPager(String pageNo, String pageSize) {
        if (pageNo != null && pageSize != null) {
            return getPager(Integer.valueOf(pageNo), Integer.valueOf(pageSize));
        }
        return getPager(1);
    }

    /**
     * 从配置文件中去读取默认的默认页大小
     * @return 每页默认显示的个数
     */
    private static int getPageSize() {
        return SingletonConfigUtils.getInstance().getInt(AppLoadConstants.PAGER_PAGE_SIZE);
    }

}
