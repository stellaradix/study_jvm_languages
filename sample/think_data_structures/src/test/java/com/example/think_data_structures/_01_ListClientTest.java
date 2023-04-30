package com.example.think_data_structures;

import com.example.think_data_structures._01_ListClient.ListClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class _01_ListClientTest {

	@Test
	public void testListClient() {
		ListClient lc = new ListClient();
		List list = lc.getList();

		// Assertions.assertInstanceOf(LinkedList.class, list);
		Assertions.assertInstanceOf(ArrayList.class, list);
	}
}