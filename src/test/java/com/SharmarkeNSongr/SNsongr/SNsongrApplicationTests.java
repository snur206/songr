package com.SharmarkeNSongr.SNsongr;

import com.SharmarkeNSongr.songr.model.Album;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SNsongrApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void testingConstructor() {
		// Arrange
		// Act
		Album testAlbum = new Album("Beautiful Minds", "Rod Wave", 24, 68.20, "https://images.complex.com/complex/images/c_fill,dpr_2.0,f_auto,q_auto,w_1400/fl_lossy,pg_1/nx8kyc4u7hwlrfkejotl/rw?fimg-ssr");
		// Assert
		assertEquals("Beautiful Minds", testAlbum.getTitle());
		assertEquals("Rod Wave", testAlbum.getArtist());
		assertEquals(24, testAlbum.getSongCount());
		assertEquals(68.20, testAlbum.getLength());
		assertEquals("https://images.complex.com/complex/images/c_fill,dpr_2.0,f_auto,q_auto,w_1400/fl_lossy,pg_1/nx8kyc4u7hwlrfkejotl/rw?fimg-ssr", testAlbum.getImgUrl());
	}
}
