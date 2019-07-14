package com.ba.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class OrderManager implements ApplicationContextAware {

	private IDelivery delService;
	private PersonInfo pinfo;
	private OrderInfo oinfo;
	private AddressInfo ainfo;

	private ApplicationContext ctx;

	public void processOrder() {
		if (ainfo != null) {
			long zipCode = ainfo.getZip();
			if (zipCode >= 5000) {
				// Get Bludedart obj
				delService = ctx.getBean("bluedart", BlueDartDeliverService.class);
			} else {
				// Get DTDC obj
				delService = ctx.getBean("dtdc", DTDCDeliverService.class);
			}
			delService.deliver(pinfo, oinfo, ainfo);
		}
	}

	public void setDelService(IDelivery delService) {
		this.delService = delService;
	}

	public void setPinfo(PersonInfo pinfo) {
		this.pinfo = pinfo;
	}

	public void setOinfo(OrderInfo oinfo) {
		this.oinfo = oinfo;
	}

	public void setAinfo(AddressInfo ainfo) {
		this.ainfo = ainfo;
	}

	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("setter");
		this.ctx = ctx;
	}

}
