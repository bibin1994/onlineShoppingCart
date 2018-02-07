$(function() {
	switch (menu) {

	case 'about':
		$('#about').addClass('active');
		break;
	case 'contact':
		$('#contact').addClass('active');
		break;
	case 'services':
		$('#services').addClass('active');
		break;
	case 'home':
		$('#home').addClass('active');
		break;
	default:
		$('#home').addclass('active');
		break;

	}

});