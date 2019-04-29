import javabean.FireBean;

import java.util.List;

/**
 *
 * csv to javabean test
 *
 * @author 科兴第一盖伦
 * @version 2019/4/28
 */
public class CSV2JavaBeanTest
{
    public static void main(String[] args)
    {
        List<FireBean> fireBeans = CSV2JavaBean.getBeanList("src/test/resources/project.conf", FireBean.class);
        System.out.println(fireBeans.size());
        for (FireBean fireBean : fireBeans)
            System.out.println(fireBean.getId() + "-" + fireBean.getBuff());
    }
}
