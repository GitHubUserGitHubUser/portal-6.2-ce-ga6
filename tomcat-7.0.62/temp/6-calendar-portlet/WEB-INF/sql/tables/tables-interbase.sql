create table Calendar (
	uuid_ varchar(75),
	calendarId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	resourceBlockId int64,
	calendarResourceId int64,
	name varchar(4000),
	description varchar(4000),
	timeZoneId varchar(75),
	color integer,
	defaultCalendar smallint,
	enableComments smallint,
	enableRatings smallint
);

create table CalendarBooking (
	uuid_ varchar(75),
	calendarBookingId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	resourceBlockId int64,
	calendarId int64,
	calendarResourceId int64,
	parentCalendarBookingId int64,
	vEventUid varchar(255),
	title varchar(4000),
	description blob,
	location varchar(4000),
	startTime int64,
	endTime int64,
	allDay smallint,
	recurrence varchar(4000),
	firstReminder int64,
	firstReminderType varchar(75),
	secondReminder int64,
	secondReminderType varchar(75),
	status integer,
	statusByUserId int64,
	statusByUserName varchar(75),
	statusDate timestamp
);

create table CalendarNotificationTemplate (
	uuid_ varchar(75),
	calendarNotificationTemplateId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	calendarId int64,
	notificationType varchar(75),
	notificationTypeSettings varchar(75),
	notificationTemplateType varchar(75),
	subject varchar(75),
	body blob
);

create table CalendarResource (
	uuid_ varchar(75),
	calendarResourceId int64 not null primary key,
	groupId int64,
	companyId int64,
	userId int64,
	userName varchar(75),
	createDate timestamp,
	modifiedDate timestamp,
	resourceBlockId int64,
	classNameId int64,
	classPK int64,
	classUuid varchar(75),
	code_ varchar(75),
	name varchar(4000),
	description varchar(4000),
	active_ smallint
);