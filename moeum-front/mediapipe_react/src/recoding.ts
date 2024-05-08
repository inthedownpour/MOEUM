let recordedEvents: string[] = [];

export const saveEvent = (label: string) => {

    recordedEvents.push(label.toString());
    console.log('Recorded events:', recordedEvents);
    console.log({ recordedEvents })

    if (recordedEvents.length === 12) {
        alert('녹화가 완료되었습니다.');
        console.log("끝");
    }
};

export const getRecordedEvents = () => recordedEvents;

export const clearRecordedEvents = () => {
    recordedEvents = [];
};

