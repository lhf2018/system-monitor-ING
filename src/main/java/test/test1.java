package test;


import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.SystemStatusService;

@Component
public class test1 {
    @Autowired
    SystemStatusService systemStatusService;

    @Test
    public void test2(){

        System.out.println(systemStatusService);
    }
    @Test
    public void time() throws SigarException {
//        Cpu cpu=systemStatusService.getCpu();
//        System.out.println(cpu.getCombined());
//        System.out.println(System.getProperty("java.class.path"));
//        System.out.println((double)(sigar.getMem().getFree())/(double)(sigar.getMem().getTotal()));
//        System.out.println(sigar.getCpuPerc().getCombined());
//        String time=systemStatusService.getTime();
//        System.out.println(time);
//        Cpu cpu=systemStatusService.getCpu();
//        System.out.println(cpu.getCpuLength());
//        System.out.println(Arrays.toString(cpu.getInfos()));
//        System.out.println(cpu.getModel());
//        System.out.println(cpu.getVendor());
//        System.out.println(cpu.getFrequency());
//        for(int i=0;i<10;i++){
//            System.out.println(Math.random());
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(cpu.getSysUsed());
//        }
    }
}
